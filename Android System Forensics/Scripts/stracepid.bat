@echo off

cd C:\Users\UserPC\AppData\Local\Android\sdk\platform-tools\

rem adb shell "su & strace -p 1"

rem set /p pid = "Enter PID: "

rem adb shell "su & strace -p %1%"

rem adb shell "su & ps"

adb root

adb shell "su & timeout 60 strace -p %1" 