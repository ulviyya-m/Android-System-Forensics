@echo off

cd C:\Users\UserPC\AppData\Local\Android\sdk\platform-tools\

adb root

adb shell "su & timeout 60 strace -f -t -e trace=file -p %1"