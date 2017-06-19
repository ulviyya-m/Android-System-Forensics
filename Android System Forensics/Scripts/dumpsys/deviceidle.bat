@echo off

cd C:\Users\UserPC\AppData\Local\Android\sdk\platform-tools\

adb root

adb shell "su & deviceidle" > output.txt