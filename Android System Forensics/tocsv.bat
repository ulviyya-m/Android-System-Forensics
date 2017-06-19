@echo off
setlocal
> Output\output.csv (
for /F "tokens=* delims= " %%a in (C:\Users\UserPC\AppData\Local\Android\sdk\platform-tools\output.txt) do @call :processaline %%a
endlocal
goto :eof
:processaline
setlocal
set data=%*
echo %data: =,%
endlocal
goto:eof
)