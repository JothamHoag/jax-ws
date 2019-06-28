/**
 * Copyright (c) 2019, Liberty Mutual
 * Proprietary and Confidential
 * All Rights Reserved
 */

package pipe;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

//@WebService (targetNamespace="http://javabean.jh/", serviceName="RequestService", portName="RequestPort")
@WebService(targetNamespace = "http://com.lmig.jh.quote", serviceName = "LmigQuoteService", portName = "QuotingPort")
public class QuoteService
{

    private static int lastAssignedQuoteId = 0;

    @WebMethod(operationName = "startQuote", exclude = false)
    @WebResult(name = "QuoteResponseJH")
    public QuoteResponse processQuote(@WebParam(name = "quoteRequest") QuoteRequest request)
    {
        QuoteResponse response = new QuoteResponse();

        if ((request.getQuoteId() == null) || (request.getQuoteId().trim().length() == 0))
        {
            request.setQuoteId(Integer.toString(++lastAssignedQuoteId));
        }
        response.setQuoteRequest(request);

        response.setPremium("$100.00");

        return response;
    }
}
