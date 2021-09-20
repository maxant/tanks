package ch.maxant.tanks

import io.quarkus.qute.Template
import io.quarkus.qute.TemplateInstance
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType

@Path("/tanks")
class Tanks {

    @Inject
    lateinit var tanks: Template

    @GET
    @Produces(MediaType.TEXT_HTML)
    operator fun get(@QueryParam("name") name: String?): TemplateInstance {
        return tanks.data("name", name)
    }
}