def call (string stagename){
	if ("${stagename}"=="Build")
		{
			sh 'mvn clean packahe'
		}
			}

