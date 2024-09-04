@echo off
if not exist ..\cookies.db goto noDatabaseExists
if not exist clean.db goto createCleanDatabase
goto cleanTheDatabase

goto end
:createCleanDatabase
echo Creating a copy of a clean database...
copy ..\cookies.db clean.db
goto end

:cleanTheDatabase
echo Cleaning the database...
copy clean.db ..\cookies.db
goto end

:noDatabaseExists
echo You have to first run the project and authenticate in order to create a database!
goto end

:end
