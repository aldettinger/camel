/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kubernetes.namespaces;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class KubernetesNamespacesEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "apiVersion": ((KubernetesNamespacesEndpoint) target).getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "dnsDomain": ((KubernetesNamespacesEndpoint) target).getConfiguration().setDnsDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "kubernetesClient": ((KubernetesNamespacesEndpoint) target).getConfiguration().setKubernetesClient(property(camelContext, io.fabric8.kubernetes.client.KubernetesClient.class, value)); return true;
        case "portName": ((KubernetesNamespacesEndpoint) target).getConfiguration().setPortName(property(camelContext, java.lang.String.class, value)); return true;
        case "portProtocol": ((KubernetesNamespacesEndpoint) target).getConfiguration().setPortProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((KubernetesNamespacesEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "labelKey": ((KubernetesNamespacesEndpoint) target).getConfiguration().setLabelKey(property(camelContext, java.lang.String.class, value)); return true;
        case "labelValue": ((KubernetesNamespacesEndpoint) target).getConfiguration().setLabelValue(property(camelContext, java.lang.String.class, value)); return true;
        case "namespace": ((KubernetesNamespacesEndpoint) target).getConfiguration().setNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "poolSize": ((KubernetesNamespacesEndpoint) target).getConfiguration().setPoolSize(property(camelContext, int.class, value)); return true;
        case "resourceName": ((KubernetesNamespacesEndpoint) target).getConfiguration().setResourceName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionHandler": ((KubernetesNamespacesEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((KubernetesNamespacesEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((KubernetesNamespacesEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KubernetesNamespacesEndpoint) target).getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((KubernetesNamespacesEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectionTimeout": ((KubernetesNamespacesEndpoint) target).getConfiguration().setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": ((KubernetesNamespacesEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "caCertData": ((KubernetesNamespacesEndpoint) target).getConfiguration().setCaCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "caCertFile": ((KubernetesNamespacesEndpoint) target).getConfiguration().setCaCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientCertData": ((KubernetesNamespacesEndpoint) target).getConfiguration().setClientCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientCertFile": ((KubernetesNamespacesEndpoint) target).getConfiguration().setClientCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyAlgo": ((KubernetesNamespacesEndpoint) target).getConfiguration().setClientKeyAlgo(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyData": ((KubernetesNamespacesEndpoint) target).getConfiguration().setClientKeyData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyFile": ((KubernetesNamespacesEndpoint) target).getConfiguration().setClientKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyPassphrase": ((KubernetesNamespacesEndpoint) target).getConfiguration().setClientKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthToken": ((KubernetesNamespacesEndpoint) target).getConfiguration().setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((KubernetesNamespacesEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "trustCerts": ((KubernetesNamespacesEndpoint) target).getConfiguration().setTrustCerts(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "username": ((KubernetesNamespacesEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "apiversion": ((KubernetesNamespacesEndpoint) target).getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "dnsdomain": ((KubernetesNamespacesEndpoint) target).getConfiguration().setDnsDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "kubernetesclient": ((KubernetesNamespacesEndpoint) target).getConfiguration().setKubernetesClient(property(camelContext, io.fabric8.kubernetes.client.KubernetesClient.class, value)); return true;
        case "portname": ((KubernetesNamespacesEndpoint) target).getConfiguration().setPortName(property(camelContext, java.lang.String.class, value)); return true;
        case "portprotocol": ((KubernetesNamespacesEndpoint) target).getConfiguration().setPortProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((KubernetesNamespacesEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "labelkey": ((KubernetesNamespacesEndpoint) target).getConfiguration().setLabelKey(property(camelContext, java.lang.String.class, value)); return true;
        case "labelvalue": ((KubernetesNamespacesEndpoint) target).getConfiguration().setLabelValue(property(camelContext, java.lang.String.class, value)); return true;
        case "namespace": ((KubernetesNamespacesEndpoint) target).getConfiguration().setNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "poolsize": ((KubernetesNamespacesEndpoint) target).getConfiguration().setPoolSize(property(camelContext, int.class, value)); return true;
        case "resourcename": ((KubernetesNamespacesEndpoint) target).getConfiguration().setResourceName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler": ((KubernetesNamespacesEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((KubernetesNamespacesEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((KubernetesNamespacesEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KubernetesNamespacesEndpoint) target).getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((KubernetesNamespacesEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectiontimeout": ((KubernetesNamespacesEndpoint) target).getConfiguration().setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": ((KubernetesNamespacesEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "cacertdata": ((KubernetesNamespacesEndpoint) target).getConfiguration().setCaCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "cacertfile": ((KubernetesNamespacesEndpoint) target).getConfiguration().setCaCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertdata": ((KubernetesNamespacesEndpoint) target).getConfiguration().setClientCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertfile": ((KubernetesNamespacesEndpoint) target).getConfiguration().setClientCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyalgo": ((KubernetesNamespacesEndpoint) target).getConfiguration().setClientKeyAlgo(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeydata": ((KubernetesNamespacesEndpoint) target).getConfiguration().setClientKeyData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyfile": ((KubernetesNamespacesEndpoint) target).getConfiguration().setClientKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeypassphrase": ((KubernetesNamespacesEndpoint) target).getConfiguration().setClientKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthtoken": ((KubernetesNamespacesEndpoint) target).getConfiguration().setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((KubernetesNamespacesEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "trustcerts": ((KubernetesNamespacesEndpoint) target).getConfiguration().setTrustCerts(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "username": ((KubernetesNamespacesEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}
