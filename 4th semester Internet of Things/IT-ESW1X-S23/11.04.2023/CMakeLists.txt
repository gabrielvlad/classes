cmake_minimum_required(VERSION 3.24)
project(11_04_2023)

set(CMAKE_CXX_STANDARD 17)

add_executable(11_04_2023 main.cpp)

include_directories(C:/Program Files/FreeRTOS-LTS/FreeRTOS/Source/include)
link_directories(C:/Program Files/FreeRTOS-LTS/FreeRTOS/Source/lib)
target_link_libraries(11_04_2023 FreeRTOS)
