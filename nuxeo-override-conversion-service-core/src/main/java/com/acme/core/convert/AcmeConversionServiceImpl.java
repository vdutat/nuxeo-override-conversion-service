package com.acme.core.convert;

import java.io.Serializable;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.nuxeo.ecm.core.api.blobholder.BlobHolder;
import org.nuxeo.ecm.core.convert.api.ConversionException;
import org.nuxeo.ecm.core.convert.service.ConversionServiceImpl;
import org.nuxeo.runtime.model.ComponentContext;

public class AcmeConversionServiceImpl extends ConversionServiceImpl implements AcmeConversionService {

    private static final Logger log = LogManager.getLogger(AcmeConversionServiceImpl.class);

    /**
     * Component activated notification.
     * Called when the component is activated. All component dependencies are resolved at that moment.
     * Use this method to initialize the component.
     *
     * @param context the component context.
     */
    @Override
    public void activate(ComponentContext context) {
        log.warn("<activate> ");
    }

    @Override
    public BlobHolder convert(String converterName, BlobHolder blobHolder, Map<String, Serializable> parameters) throws ConversionException {
        log.warn("<convert> ");
        return super.convert(converterName, blobHolder, parameters);
    }

    @Override
    public BlobHolder convertToMimeType(String destinationMimeType, BlobHolder blobHolder,
            Map<String, Serializable> parameters) throws ConversionException {
        log.warn("<convertToMimeType> ");
        return super.convertToMimeType(destinationMimeType, blobHolder, parameters);
    }

}
