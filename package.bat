@echo off
set workspace=C:\Users\pc\Desktop\JoseMaria.Moreno.SVC.miw.upm.es

echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------
echo .
echo .
cd %workspace%
echo ============ mvn clean test (profile: develop) =======================================================
echo .

call mvn clean test -Denvironment.type=develop 


echo ============ mvn package en el perfil preproduction =======================================================
echo .
call mvn package -Denvironment.type=preproduction
pause