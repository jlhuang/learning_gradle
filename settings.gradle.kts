rootProject.name = "learning_gradle"

mapOf(
    ":sub_project_1" to "sub_project_1",
    ":sub_project_2" to "sub_project_2"
).forEach { (path, dir) ->
    include(path)
    project(path).projectDir = file(dir)
}