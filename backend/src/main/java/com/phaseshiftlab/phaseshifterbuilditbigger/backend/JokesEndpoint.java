/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.phaseshiftlab.phaseshifterbuilditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.phaseshiftlab.phaseshifterbuilditbigger.lib.JokeSupplier;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
  name = "jokesApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.phaseshifterbuilditbigger.phaseshiftlab.com",
    ownerName = "backend.phaseshifterbuilditbigger.phaseshiftlab.com",
    packagePath=""
  )
)
public class JokesEndpoint {

    /** A simple endpoint method that returns a random joke */
    @ApiMethod(name = "sayJoke")
    public JokesBean sayJoke() {
        JokesBean response = new JokesBean();
        String joke = JokeSupplier.supplyJoke();
        response.setJoke(joke);

        return response;
    }

}
