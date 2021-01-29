package com.travelService.config;

/*@EnableWebSecurity*/
public class WebSecurityConfiguration /*extends WebSecurityConfigurerAdapter*/ {

/*	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().exceptionHandling()
				.authenticationEntryPoint(
						(request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
				.and().authorizeRequests().antMatchers("/**").authenticated().and().httpBasic().
		and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
*/

}
