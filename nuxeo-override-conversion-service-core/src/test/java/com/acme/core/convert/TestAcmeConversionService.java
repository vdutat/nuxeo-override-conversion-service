package com.acme.core.convert;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.ecm.core.convert.api.ConversionService;
import org.nuxeo.ecm.platform.test.PlatformFeature;
import org.nuxeo.runtime.test.runner.Deploy;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;

import jakarta.inject.Inject;

@RunWith(FeaturesRunner.class)
@Features({ PlatformFeature.class })
@Deploy("com.acme.core.convert.nuxeo-override-conversion-service-core")
public class TestAcmeConversionService {

    @Inject
    protected ConversionService acmeconversionservice;

    @Test
    public void testService() {
        assertNotNull(acmeconversionservice);
    }
}
