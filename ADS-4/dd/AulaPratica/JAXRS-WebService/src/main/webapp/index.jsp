<web-app>
  <display-name>Archetype Created Web Application</display-name>
  <servlet>
  <servlet-name>jersey-serlvet</servlet-name>
  <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
  <init-param>
   <param-name>com.sun.jersey.config.property.packages</param-name>
   <param-value>br.senai.controlador</param-value>
  </init-param>
  <init-param>
   <param-name>com.sun.jersey.api.json.POJOMappingFeature</param-name>
   <param-value>true</param-value>
  </init-param>
  
  <load-on-startup>1</load-on-startup>
 </servlet>
 <servlet-mapping>
  <servlet-name>jersey-serlvet</servlet-name>
  <url-pattern>/rest/*</url-pattern>
 </servlet-mapping>
</web-app>
