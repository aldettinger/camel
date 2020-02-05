/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.swf;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SWFEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "amazonSWClient": ((SWFEndpoint) target).getConfiguration().setAmazonSWClient(property(camelContext, com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow.class, value)); return true;
        case "dataConverter": ((SWFEndpoint) target).getConfiguration().setDataConverter(property(camelContext, com.amazonaws.services.simpleworkflow.flow.DataConverter.class, value)); return true;
        case "domainName": ((SWFEndpoint) target).getConfiguration().setDomainName(property(camelContext, java.lang.String.class, value)); return true;
        case "eventName": ((SWFEndpoint) target).getConfiguration().setEventName(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((SWFEndpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "version": ((SWFEndpoint) target).getConfiguration().setVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((SWFEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((SWFEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((SWFEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((SWFEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((SWFEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clientConfigurationParameters": ((SWFEndpoint) target).getConfiguration().setClientConfigurationParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "startWorkflowOptionsParameters": ((SWFEndpoint) target).getConfiguration().setStartWorkflowOptionsParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "sWClientParameters": ((SWFEndpoint) target).getConfiguration().setSWClientParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "synchronous": ((SWFEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "activityList": ((SWFEndpoint) target).getConfiguration().setActivityList(property(camelContext, java.lang.String.class, value)); return true;
        case "activitySchedulingOptions": ((SWFEndpoint) target).getConfiguration().setActivitySchedulingOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions.class, value)); return true;
        case "activityThreadPoolSize": ((SWFEndpoint) target).getConfiguration().setActivityThreadPoolSize(property(camelContext, int.class, value)); return true;
        case "activityTypeExecutionOptions": ((SWFEndpoint) target).getConfiguration().setActivityTypeExecutionOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeExecutionOptions.class, value)); return true;
        case "activityTypeRegistrationOptions": ((SWFEndpoint) target).getConfiguration().setActivityTypeRegistrationOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeRegistrationOptions.class, value)); return true;
        case "childPolicy": ((SWFEndpoint) target).getConfiguration().setChildPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "executionStartToCloseTimeout": ((SWFEndpoint) target).getConfiguration().setExecutionStartToCloseTimeout(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": ((SWFEndpoint) target).getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "signalName": ((SWFEndpoint) target).getConfiguration().setSignalName(property(camelContext, java.lang.String.class, value)); return true;
        case "stateResultType": ((SWFEndpoint) target).getConfiguration().setStateResultType(property(camelContext, java.lang.String.class, value)); return true;
        case "taskStartToCloseTimeout": ((SWFEndpoint) target).getConfiguration().setTaskStartToCloseTimeout(property(camelContext, java.lang.String.class, value)); return true;
        case "terminationDetails": ((SWFEndpoint) target).getConfiguration().setTerminationDetails(property(camelContext, java.lang.String.class, value)); return true;
        case "terminationReason": ((SWFEndpoint) target).getConfiguration().setTerminationReason(property(camelContext, java.lang.String.class, value)); return true;
        case "workflowList": ((SWFEndpoint) target).getConfiguration().setWorkflowList(property(camelContext, java.lang.String.class, value)); return true;
        case "workflowTypeRegistrationOptions": ((SWFEndpoint) target).getConfiguration().setWorkflowTypeRegistrationOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions.class, value)); return true;
        case "accessKey": ((SWFEndpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((SWFEndpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "amazonswclient": ((SWFEndpoint) target).getConfiguration().setAmazonSWClient(property(camelContext, com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow.class, value)); return true;
        case "dataconverter": ((SWFEndpoint) target).getConfiguration().setDataConverter(property(camelContext, com.amazonaws.services.simpleworkflow.flow.DataConverter.class, value)); return true;
        case "domainname": ((SWFEndpoint) target).getConfiguration().setDomainName(property(camelContext, java.lang.String.class, value)); return true;
        case "eventname": ((SWFEndpoint) target).getConfiguration().setEventName(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((SWFEndpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "version": ((SWFEndpoint) target).getConfiguration().setVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((SWFEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((SWFEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((SWFEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((SWFEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((SWFEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clientconfigurationparameters": ((SWFEndpoint) target).getConfiguration().setClientConfigurationParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "startworkflowoptionsparameters": ((SWFEndpoint) target).getConfiguration().setStartWorkflowOptionsParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "swclientparameters": ((SWFEndpoint) target).getConfiguration().setSWClientParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "synchronous": ((SWFEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "activitylist": ((SWFEndpoint) target).getConfiguration().setActivityList(property(camelContext, java.lang.String.class, value)); return true;
        case "activityschedulingoptions": ((SWFEndpoint) target).getConfiguration().setActivitySchedulingOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions.class, value)); return true;
        case "activitythreadpoolsize": ((SWFEndpoint) target).getConfiguration().setActivityThreadPoolSize(property(camelContext, int.class, value)); return true;
        case "activitytypeexecutionoptions": ((SWFEndpoint) target).getConfiguration().setActivityTypeExecutionOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeExecutionOptions.class, value)); return true;
        case "activitytyperegistrationoptions": ((SWFEndpoint) target).getConfiguration().setActivityTypeRegistrationOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeRegistrationOptions.class, value)); return true;
        case "childpolicy": ((SWFEndpoint) target).getConfiguration().setChildPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "executionstarttoclosetimeout": ((SWFEndpoint) target).getConfiguration().setExecutionStartToCloseTimeout(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": ((SWFEndpoint) target).getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "signalname": ((SWFEndpoint) target).getConfiguration().setSignalName(property(camelContext, java.lang.String.class, value)); return true;
        case "stateresulttype": ((SWFEndpoint) target).getConfiguration().setStateResultType(property(camelContext, java.lang.String.class, value)); return true;
        case "taskstarttoclosetimeout": ((SWFEndpoint) target).getConfiguration().setTaskStartToCloseTimeout(property(camelContext, java.lang.String.class, value)); return true;
        case "terminationdetails": ((SWFEndpoint) target).getConfiguration().setTerminationDetails(property(camelContext, java.lang.String.class, value)); return true;
        case "terminationreason": ((SWFEndpoint) target).getConfiguration().setTerminationReason(property(camelContext, java.lang.String.class, value)); return true;
        case "workflowlist": ((SWFEndpoint) target).getConfiguration().setWorkflowList(property(camelContext, java.lang.String.class, value)); return true;
        case "workflowtyperegistrationoptions": ((SWFEndpoint) target).getConfiguration().setWorkflowTypeRegistrationOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions.class, value)); return true;
        case "accesskey": ((SWFEndpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((SWFEndpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}
