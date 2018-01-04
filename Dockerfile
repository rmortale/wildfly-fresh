FROM jboss/wildfly:11.0.0.Final
ADD target/wildfly-fresh-mv.war /opt/jboss/wildfly/standalone/deployments/
 
