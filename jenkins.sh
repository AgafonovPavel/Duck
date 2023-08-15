$javaProcess = Start-Process -FilePath "java" -ArgumentList "-jar duck-service-2.0.0.jar" -PassThru
$javaPID = $javaProcess.Id
Write-Output "PID процесса Java: $javaPID"