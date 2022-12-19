# Spring WS - test project

This project is a small test project for Spring WS. 
Mainly to see how Spring WS how Spring WS handles multiple
endpoints within one Spring Boot project.

The conclusion so far is that it is difficult to provide
separate endpoint URL's for the more than one service within
a Spring Boot project. The web service configuration creates
a mapping for a url pattern or one or more URL's, but what endpoint
that actually is serviced from a certain URL is only dependent
(in this configuration) on the payload. I.E. the payload format
and namespace is tied to a specific method, but which endpoint
this lies within, Spring WS does not care about.

This is different from how JAX-WS works, there one service is 
strictly tied to one endpoint URL.

In practice, this should not be a problem, but it might be seen 
as an inconsistency.