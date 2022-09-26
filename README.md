# test-spring-auth

This app has three pages:

* /

* /admin.html

* /admin2.html

The home page has no auth. But the admin pages require a login of "admin":"admin"
to access.

Go to /logout to revoke your access after logging in.

## Implementation
The access control is handled in [SecurityConfig](src/main/java/com/example/testspringauth/SecurityConfig.java) and depends on the spring-boot-starter-security library in
[the pom](pom.xml).

I don't understand the language used in SecurityConfig so try looking at the examples in 
`org.springframework.security.config.annotation.web.builders.HttpSecurity` and seasoning your own app to taste.
