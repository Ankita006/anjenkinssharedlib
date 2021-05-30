def call (String stagename){
	if ("${stagename}" == "Build")
		{
			sh 'mvn clean package'
		}
			}

