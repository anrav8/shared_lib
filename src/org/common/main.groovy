package org.common

class Starter {
    
    def env
    def steps

    ExampleTool(env, steps){
        this.env = env
        this.steps = steps
    }

    def printEnv(){
        steps.echo "< Build ${env.BUILD_ID} on ${env.JOB_NAME} >"
    }
}
