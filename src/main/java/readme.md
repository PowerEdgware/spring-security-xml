
** 开启spring-security <debug/>后：**  

```
********************************************************************
**********        Security debugging is enabled.       *************
**********    This may include sensitive information.  *************
**********      Do not use in a production system!     *************
********************************************************************
```

在`min-security.xml`配置下自动添加的filter:  

```
Security filter chain: [
  SecurityContextPersistenceFilter
  WebAsyncManagerIntegrationFilter
  HeaderWriterFilter
  CsrfFilter
  LogoutFilter
  UsernamePasswordAuthenticationFilter
  DefaultLoginPageGeneratingFilter
  DefaultLogoutPageGeneratingFilter
  RequestCacheAwareFilter
  SecurityContextHolderAwareRequestFilter
  AnonymousAuthenticationFilter
  SessionManagementFilter
  ExceptionTranslationFilter
  FilterSecurityInterceptor
]
```