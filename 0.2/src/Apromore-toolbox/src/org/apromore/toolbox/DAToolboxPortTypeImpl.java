
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.apromore.toolbox;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2011-07-19T17:29:30.633+10:00
 * Generated source version: 2.4.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "DAToolboxService",
                      portName = "DAToolbox",
                      targetNamespace = "http://www.apromore.org/data_access/service_toolbox",
                      wsdlLocation = "http://localhost:8080/Apromore-dataAccess/services/DAToolbox?wsdl",
                      endpointInterface = "org.apromore.toolbox.DAToolboxPortType")
                      
public class DAToolboxPortTypeImpl implements DAToolboxPortType {

    private static final Logger LOG = Logger.getLogger(DAToolboxPortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see org.apromore.toolbox.DAToolboxPortType#readCanonicals(org.apromore.toolbox.model_da.ReadCanonicalsInputMsgType  payload )*
     */
    public org.apromore.toolbox.model_da.ReadCanonicalsOutputMsgType readCanonicals(org.apromore.toolbox.model_da.ReadCanonicalsInputMsgType payload) { 
        LOG.info("Executing operation readCanonicals");
        System.out.println(payload);
        try {
            org.apromore.toolbox.model_da.ReadCanonicalsOutputMsgType _return = new org.apromore.toolbox.model_da.ReadCanonicalsOutputMsgType();
            org.apromore.toolbox.model_da.ResultType _returnResult = new org.apromore.toolbox.model_da.ResultType();
            _returnResult.setMessage("Message1217319847");
            _returnResult.setCode(Integer.valueOf(-1413936742));
            _return.setResult(_returnResult);
            org.apromore.toolbox.model_da.CanonicalsType _returnCanonicals = new org.apromore.toolbox.model_da.CanonicalsType();
            java.util.List<org.apromore.toolbox.model_da.CanonicalType> _returnCanonicalsCanonical = new java.util.ArrayList<org.apromore.toolbox.model_da.CanonicalType>();
            org.apromore.toolbox.model_da.CanonicalType _returnCanonicalsCanonicalVal1 = new org.apromore.toolbox.model_da.CanonicalType();
            _returnCanonicalsCanonicalVal1.setProcessId(1458541008);
            _returnCanonicalsCanonicalVal1.setVersionName("VersionName-314622409");
            javax.activation.DataHandler _returnCanonicalsCanonicalVal1Cpf = null;
            _returnCanonicalsCanonicalVal1.setCpf(_returnCanonicalsCanonicalVal1Cpf);
            _returnCanonicalsCanonical.add(_returnCanonicalsCanonicalVal1);
            _returnCanonicals.getCanonical().addAll(_returnCanonicalsCanonical);
            _return.setCanonicals(_returnCanonicals);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.apromore.toolbox.DAToolboxPortType#readProcessSummaries(org.apromore.toolbox.model_da.ReadProcessSummariesInputMsgType  payload )*
     */
    public org.apromore.toolbox.model_da.ReadProcessSummariesOutputMsgType readProcessSummaries(org.apromore.toolbox.model_da.ReadProcessSummariesInputMsgType payload) { 
        LOG.info("Executing operation readProcessSummaries");
        System.out.println(payload);
        try {
            org.apromore.toolbox.model_da.ReadProcessSummariesOutputMsgType _return = new org.apromore.toolbox.model_da.ReadProcessSummariesOutputMsgType();
            org.apromore.toolbox.model_da.ResultType _returnResult = new org.apromore.toolbox.model_da.ResultType();
            _returnResult.setMessage("Message1673969387");
            _returnResult.setCode(Integer.valueOf(-2076028638));
            _return.setResult(_returnResult);
            org.apromore.toolbox.model_da.ProcessSummariesType _returnProcessSummaries = new org.apromore.toolbox.model_da.ProcessSummariesType();
            java.util.List<org.apromore.toolbox.model_da.ProcessSummaryType> _returnProcessSummariesProcessSummary = new java.util.ArrayList<org.apromore.toolbox.model_da.ProcessSummaryType>();
            org.apromore.toolbox.model_da.ProcessSummaryType _returnProcessSummariesProcessSummaryVal1 = new org.apromore.toolbox.model_da.ProcessSummaryType();
            java.util.List<org.apromore.toolbox.model_da.VersionSummaryType> _returnProcessSummariesProcessSummaryVal1VersionSummaries = new java.util.ArrayList<org.apromore.toolbox.model_da.VersionSummaryType>();
            _returnProcessSummariesProcessSummaryVal1.getVersionSummaries().addAll(_returnProcessSummariesProcessSummaryVal1VersionSummaries);
            _returnProcessSummariesProcessSummaryVal1.setOriginalNativeType("OriginalNativeType-1345761725");
            _returnProcessSummariesProcessSummaryVal1.setName("Name-1327387832");
            _returnProcessSummariesProcessSummaryVal1.setId(Integer.valueOf(-917368780));
            _returnProcessSummariesProcessSummaryVal1.setDomain("Domain1078396797");
            _returnProcessSummariesProcessSummaryVal1.setRanking("Ranking2049556992");
            _returnProcessSummariesProcessSummaryVal1.setLastVersion("LastVersion-1823986955");
            _returnProcessSummariesProcessSummaryVal1.setOwner("Owner-375398528");
            _returnProcessSummariesProcessSummary.add(_returnProcessSummariesProcessSummaryVal1);
            _returnProcessSummaries.getProcessSummary().addAll(_returnProcessSummariesProcessSummary);
            _return.setProcessSummaries(_returnProcessSummaries);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.apromore.toolbox.DAToolboxPortType#storeCpf(org.apromore.toolbox.model_da.StoreCpfInputMsgType  payload )*
     */
    public org.apromore.toolbox.model_da.StoreCpfOutputMsgType storeCpf(org.apromore.toolbox.model_da.StoreCpfInputMsgType payload) { 
        LOG.info("Executing operation storeCpf");
        System.out.println(payload);
        try {
            org.apromore.toolbox.model_da.StoreCpfOutputMsgType _return = new org.apromore.toolbox.model_da.StoreCpfOutputMsgType();
            org.apromore.toolbox.model_da.ResultType _returnResult = new org.apromore.toolbox.model_da.ResultType();
            _returnResult.setMessage("Message-538147974");
            _returnResult.setCode(Integer.valueOf(-818591965));
            _return.setResult(_returnResult);
            org.apromore.toolbox.model_da.ProcessSummaryType _returnProcessSummary = new org.apromore.toolbox.model_da.ProcessSummaryType();
            java.util.List<org.apromore.toolbox.model_da.VersionSummaryType> _returnProcessSummaryVersionSummaries = new java.util.ArrayList<org.apromore.toolbox.model_da.VersionSummaryType>();
            org.apromore.toolbox.model_da.VersionSummaryType _returnProcessSummaryVersionSummariesVal1 = new org.apromore.toolbox.model_da.VersionSummaryType();
            java.util.List<org.apromore.toolbox.model_da.AnnotationsType> _returnProcessSummaryVersionSummariesVal1Annotations = new java.util.ArrayList<org.apromore.toolbox.model_da.AnnotationsType>();
            _returnProcessSummaryVersionSummariesVal1.getAnnotations().addAll(_returnProcessSummaryVersionSummariesVal1Annotations);
            _returnProcessSummaryVersionSummariesVal1.setRanking("Ranking398779697");
            _returnProcessSummaryVersionSummariesVal1.setName("Name1781385248");
            _returnProcessSummaryVersionSummariesVal1.setLastUpdate("LastUpdate185481253");
            _returnProcessSummaryVersionSummariesVal1.setCreationDate("CreationDate316484555");
            _returnProcessSummaryVersionSummariesVal1.setScore(Double.valueOf(0.018768653363059662));
            _returnProcessSummaryVersionSummaries.add(_returnProcessSummaryVersionSummariesVal1);
            _returnProcessSummary.getVersionSummaries().addAll(_returnProcessSummaryVersionSummaries);
            _returnProcessSummary.setOriginalNativeType("OriginalNativeType-1416785299");
            _returnProcessSummary.setName("Name-198022933");
            _returnProcessSummary.setId(Integer.valueOf(988286360));
            _returnProcessSummary.setDomain("Domain1944206493");
            _returnProcessSummary.setRanking("Ranking604998919");
            _returnProcessSummary.setLastVersion("LastVersion489452130");
            _returnProcessSummary.setOwner("Owner1437491494");
            _return.setProcessSummary(_returnProcessSummary);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}