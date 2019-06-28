/**
 * Copyright (c) 2019, Liberty Mutual
 * Proprietary and Confidential
 * All Rights Reserved
 */

package pipe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "quoteRequest", "premium" })
@XmlAccessorType(XmlAccessType.NONE)
public class QuoteResponse
{
    @XmlElement(name = "quoteIdentifiers")
    QuoteRequest quoteRequest;

    @XmlElement
    String premium;

    public QuoteRequest getQuoteRequest()
    {
        return quoteRequest;
    }

    public void setQuoteRequest(QuoteRequest quoteRequest)
    {
        this.quoteRequest = quoteRequest;
    }

    public String getPremium()
    {
        return premium;
    }

    public void setPremium(String premium)
    {
        this.premium = premium;
    }

}
