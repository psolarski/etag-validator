package org.etag.validator.aspect

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.reflect.MethodSignature
import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes

@Aspect
class EtagAspect {

    @Before("org.etag.validator.aspect.EtagPointcut.createEtagAnnotation()")
    fun validateRequiredEtagHeaders(joinPoint: JoinPoint) {
        val signature: MethodSignature = joinPoint.signature as MethodSignature
        val method = signature.method
    }

    private fun getHeaderFromRequest(headerName: String): String? {
        val servletRequestAttributes: ServletRequestAttributes =
            RequestContextHolder.getRequestAttributes() as (ServletRequestAttributes)
        val request = servletRequestAttributes.request
        return request.getHeader(headerName);
    }
}
