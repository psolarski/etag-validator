package org.etag.validator.aspect

import org.aspectj.lang.annotation.Pointcut

class EtagPointcut {

    @Pointcut("@annotation(org.etag.validator.core.CreateEtag)")
    fun createEtagAnnotation() {
    }

    @Pointcut("@annotation(org.etag.validator.core.ValidateEtag)")
    fun validateEtagAnnotation() {
    }
}
