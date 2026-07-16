@echo off
set /p msg="Enter what is new in this version: "
set /p tag="Enter version tag (e.g. v3.1): "

echo.
echo [1/4] Adding files...
git add .

echo [2/4] Committing changes...
git commit -m "%msg%"

echo [3/4] Pushing code to GitHub...
git push origin main

echo [4/4] Triggering Auto-Build (Tagging)...
git tag %tag%
git push origin %tag%

echo.
echo Done! Opening GitHub Actions to track your build...
start https://github.com/isaac458/Toot-app/actions
echo.
echo Wait 3-5 minutes, then check the Releases page.
pause
