#include <FreeRTOS.h>
#include <task.h>
#include <queue.h>
#include <iostream>

using namespace std;

QueueHandle_t msgQueue;

void taskA(void* parameter) {
    const char* msg = "Hello, TaskB!";
    xQueueSend(msgQueue, &msg[0], portMAX_DELAY);
}

void taskB(void* parameter) {
    char buf[20];
    xQueueReceive(msgQueue, &buf[0], portMAX_DELAY);
    cout << "Received message: " << buf << endl;
}

int main() {
    msgQueue = xQueueCreate(10, sizeof(char*));
    xTaskCreate(taskA, "TaskA", configMINIMAL_STACK_SIZE, NULL, tskIDLE_PRIORITY, NULL);
    xTaskCreate(taskB, "TaskB", configMINIMAL_STACK_SIZE, NULL, tskIDLE_PRIORITY, NULL);
    vTaskStartScheduler();
    return 0;
}
