<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<section class="container">
    <section class="section-cta">
        <div class="container center-text">
            <span class="subheading">Activate Your Account</span>
            <h2 class="heading-secondary" style="color: #545454;">
                Sign in to your Account
            </h2>
        </div>

        <div class="container grid grid--2-cols margin-bottom-md" style="grid-gap: 0;">
            <div class="backgrad_reg">&nbsp;</div>
            <div class="meal">
                <div>
                    <c:if test="${serverError != null}">
                        <div id="serverError" style="padding: 10px; margin: 10px;" class="alert alert-danger alert-dismissable fade show plErroMessage">
                            <button class="close" onclick="closeAlert();"><i class="fa fa-lg fa-fw fa-close"> </i></button>
                            <strong>Warning!</strong> ${serverError}
                        </div>
                    </c:if>
                    <c:if test="${successMessage != null}">
                        <div id="successMessage" style="padding: 10px; margin: 10px;" class="alert alert-success alert-dismissable fade show plErroMessage">
                            <button class="close" onclick="closeAlertsuccessMessage();"><i class="fa fa-lg fa-fw fa-close"> </i></button>
                            <strong>Success!</strong> ${successMessage}
                        </div>
                    </c:if>

                    <form:form method="post" modelAttribute="registerUser" class="cta-form-login" action="${pageContext.request.contextPath}/saveuser">
                        <div >
                            <spring:bind path="firstName">
                                <div class=" ${status.error ? 'has-error' : ''}">
                                    <div class="input-field">
                                        <label >First name<sup class="text-danger">*</sup> </label>
                                        <form:input type="text" path="firstName" id="firstName" placeholder="First name" class="theme-input" autocomplete="off" oncopy="return false" onpaste="return false"></form:input>
                                        <form:errors style="color: red;" path="firstName"></form:errors>
                                    </div>
                                </div>
                            </spring:bind>
                            <spring:bind path="lastName">
                                <div class=" ${status.error ? 'has-error' : ''}">
                                    <div class="input-field">
                                        <label >Last name<sup class="text-danger">*</sup> </label>
                                        <form:input type="text" path="lastName" id="firstName" placeholder="Last name" class="theme-input" autocomplete="off" oncopy="return false" onpaste="return false"></form:input>
                                        <form:errors style="color: red;" path="lastName"></form:errors>
                                    </div>
                                </div>
                            </spring:bind>
                            <spring:bind path="email">
                                <div class=" ${status.error ? 'has-error' : ''}">
                                    <div class="input-field">
                                        <label >Email<sup class="text-danger">*</sup></label>
                                        <form:input type="text" path="email" id="email" placeholder="Email" class="theme-input" autocomplete="off" oncopy="return false" onpaste="return false"></form:input>
                                        <form:errors style="color: red;" path="email"></form:errors>
                                    </div>
                                </div>
                            </spring:bind>
                            <spring:bind path="password">
                                <div class=" ${status.error ? 'has-error' : ''}">
                                    <div class="input-field check-password">
                                        <label >Password<sup class="text-danger">*</sup></label>
                                        <div class="check-password">
                                            <form:input type="password" path="password" name="password" placeholder="Password" class="theme-input" required=""></form:input>
                                           
                                        </div>
                                        <form:errors style="color: red;" path="password"></form:errors>
                                    </div>
                                </div>
                            </spring:bind>
                            <spring:bind path="passwordConfirm">
                                <div class=" ${status.error ? 'has-error' : ''}">
                                    <div class="input-field check-password">
                                        <label >Confirm Password<sup class="text-danger">*</sup></label>
                                        <div class="check-password">
                                            <form:input type="password" path="passwordConfirm" name="passwordConfirm" placeholder="Confirm Password" class="theme-input" required=""></form:input>

                                        </div>
                                        <form:errors style="color: red;" path="passwordConfirm"></form:errors>
                                    </div>
                                </div>
                            </spring:bind>
                        </div>
                        <div >
                            <div class="">
                                <input type="submit" class="btn btn--form">Sign Up</input>
                            </div>
                        </div>
                        <p class="container activate">Already have an Account? <a href="${pageContext.request.contextPath}/login">Sign In</a></p>
                    </form:form>
                </div>
            </div>
        </div>
    </section>

    <script>
        function closeAlert() {
            var serverError = document.getElementById("serverError");
            serverError.style.display = "none"; // Hide the pop-up
        }

        function closeAlertsuccessMessage() {
            var serverError = document.getElementById("successMessage");
            serverError.style.display = "none"; // Hide the pop-up
        }
    </script>
</section>
