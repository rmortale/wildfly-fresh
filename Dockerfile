FROM jboss/wildfly
ADD target/wildfly-fresh-mv.war /opt/jboss/wildfly/standalone/deployments/
 
