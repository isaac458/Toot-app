@echo off
color 0B
echo.
echo   ##########################################
echo   #       🦜 TOOT APP - AUTO UPDATE        #
echo   #       Version: 4.2 | Path: Drive C     #
echo   ##########################################
echo.

cd /d "C:\Users\PC\AndroidStudioProjects\MyApplication"

echo [+] Checking for local changes...
git add .

set /p msg="[?] Enter Update Message (or press Enter for default): "
if "%msg%"=="" set msg="Update to v4.2: Performance and UI improvements"

echo [+] Committing changes...
git commit -m "%msg%"

echo [+] Creating Version 4.2 Tag...
git tag -a v4.2 -m "Release Version 4.2"

echo [+] Pushing to GitHub (Main Branch + Tags)...
git push origin main --tags --force

echo.
echo [OK] Done! Your app is now updated to v4.2 on GitHub.
echo.
pause
