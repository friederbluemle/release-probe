package ychescale9.releaseprobe.persistence.dao

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.InstrumentationRegistry
import androidx.test.filters.MediumTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@MediumTest
class ArtifactGroupDaoTest : BaseDaoTest() {

    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    lateinit var dao: ArtifactGroupDao

    override fun setUp() {
        super.setUp()
        dao = database.artifactGroupDao()
    }

    @Test
    fun getArtifactGroupById() {
        // TODO dao.getArtifactGroupById(...)
    }
}