/**
 * Copyright (c) 2016, Liberty Mutual
 * Proprietary and Confidential
 * All Rights Reserved
 */

package com.lmig.pi.esalesintegration.property.service.quoteintegrationservice.v1_0;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * ESales service for quoting property line of businesses.
 * 
 * @author n0061865
 */
// @WebService(name = "QuoteIntegrationService", targetNamespace =
// "http://pi.lmig.com/esalesintegration/property/service/quoteintegrationservice/v1_0")
@WebService
public interface QuoteIntegrationService
{

    @WebMethod
    public String startQuote(String request);

}
