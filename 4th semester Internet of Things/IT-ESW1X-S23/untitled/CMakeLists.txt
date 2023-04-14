cmake_minimum_required(VERSION 3.24)
project(untitled)

set(CMAKE_CXX_STANDARD 17)

add_executable(untitled main.cpp)

include_directories(C:/Program Files/FreeRTOS-LTS/FreeRTOS/FreeRTOS-Kernel/include)
link_directories(C:/Program Files/FreeRTOS-LTS/FreeRTOS/Source/lib)
target_link_libraries(untitled "C:/Program Files/FreeRTOS-LTS/FreeRTOS/Source/lib/libFreeRTOS.a")
