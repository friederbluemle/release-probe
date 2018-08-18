package ychescale9.releaseprobe.domain.artifact.model

data class Artifact(
    val groupId: String,
    val artifactId: String,
    val versions: List<String>
)
