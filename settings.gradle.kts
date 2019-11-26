include(":app")
include(":core-ui")
include(":ui-feeds")
include(":ui-watchlist")
include(":ui-browse-collections")
include(":ui-settings")
include(":ui-artifact-list")
include(":testing-infra")
include(":background-work")
include(":data")
include(":remote-api-base")
include(":remote-api-real")
include(":remote-api-mock")
include(":persistence")
include(":domain")
includeProject(":bugsnag-tree", "library/bugsnag-tree")
includeProject(":analytics-api-base", "library/analytics/analytics-api-base")
includeProject(":analytics-api-firebase", "library/analytics/analytics-api-firebase")
includeProject(":analytics-api-no-op", "library/analytics/analytics-api-no-op")
includeProject(":coroutines-testing", "library/coroutines-testing")

fun includeProject(name: String, filePath: String) {
    include(name)
    project(name).projectDir = File(filePath)
}
