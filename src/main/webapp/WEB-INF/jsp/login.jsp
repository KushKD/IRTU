<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/flight_application_form.js"></script>

<section class="container">
    <section class="section-cta">
        <div class="container center-text">
            <span class="subheading">Welcome to Ushma Rewards</span>
            <h2 class="heading-secondary" style="color: #545454;">
                Sign in to your Account
            </h2>
        </div>
        <div class="container grid margin-bottom-md">
            <div class="meal cta-login">
                <div class="cta-login-img-box" role="img" aria-label="Woman enjoying food"></div>

                <div>
                    <form class="cta-form-login" method="post" onsubmit="return submit_form()" action="${pageContext.request.contextPath}/login">
                        <div>
                            <input
                                type="text"
                                oncopy="return false"
                                placeholder="Enter your Email"
                                autocomplete="off"
                                onfocus="this.removeAttribute('readonly');"
                                onpaste="return false"
                                maxlength="50"
                                value=""
                                required
                                autofocus
                                name="username"
                                id="username"
                            />
                        </div>
                        <div>
                            <input type="password" autocomplete="off" placeholder="Password" onfocus="this.removeAttribute('readonly');" oncopy="return false" onpaste="return false" name="password" id="password" value="" />
                        </div>
                        <!-- Captcha -->
                        <div class="col-lg-11" style="margin: 10px;">
                            <img id="captcha_id" class="col-lg-8" name="imgCaptcha" src="captcha.jpg" />
                            <a href="javascript:;" class="col-lg-2" title="change captcha text" onclick="document.getElementById('captcha_id').src = 'captcha.jpg?' + Math.random();  return false">
                                <i class="fa fa-refresh"></i>
                            </a>
                        </div>
                        <div class="col-lg-11" style="margin: 10px;">
                            <input
                                autocomplete="off"
                                placeholder="Enter Captcha"
                                onfocus="this.removeAttribute('readonly');"
                                class="form-control"
                                maxlength="5"
                                required
                                onkeypress="return alpha(event)"
                                oncopy="return false"
                                onpaste="return false"
                                id="captcha"
                                name="captcha"
                            />
                        </div>
                        <br />
                        <!-- Captcha Ends -->
                        <div class="form-group col-lg-12">
                            <input type="submit" name="submit" class="col-lg-12 btn btn-primary" value="Sign In" />
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                        </div>
                        <p class="mb-0 fs-xs mt-4">Dont have an Account? <a href="${pageContext.request.contextPath}/register">Sign Up</a></p>
                    </form>
                </div>
            </div>
        </div>

        <div>
            <div class="diets">
                <h3 class="heading-tertiary-login text-center">Not yet a Ushma Rewards member?</h3>

                <div style="padding: 3rem;">
                    <div class="grid-login grid--2-col grid-auto">
                        <div>
                            <ion-icon class="feature-icon-login" name="infinite-outline"></ion-icon>
                        </div>
                        <div>
                            <p class="feature-title-login">Members Only Rate</p>
                            <p class="feature-text-login">
                                Save up to 15% more on booking directly from our website or mobile app.
                            </p>
                        </div>
                    </div>
                    <div class="grid-login grid--2-col grid-auto">
                        <div><ion-icon class="feature-icon-login" name="nutrition-outline"></ion-icon></div>
                        <div>
                            <p class="feature-title-login">Priority Line</p>
                            <p class="feature-text-login">
                                Enjoy access to the member-only priority line for a faster check-in and check-out. Available at selected hotels only. This benefit does not apply to prizeotel.
                            </p>
                        </div>
                    </div>
                    <div class="grid-login grid--2-col grid-auto">
                        <div><ion-icon class="feature-icon-login" name="leaf-outline"></ion-icon></div>
                        <div>
                            <p class="feature-title-login">Food & Beverage Discount</p>
                            <p class="feature-text-login">
                                Get discounted food and beverages at participating hotel restaurants. This benefit does not apply to prizeotel.
                            </p>
                        </div>
                    </div>
                    <div class="grid-login grid--2-col grid-auto">
                        <div><ion-icon class="feature-icon-login" name="pause-outline"></ion-icon></div>
                        <div>
                            <p class="feature-title-login">Promotions and Free Nights</p>
                            <p class="feature-text-login">
                                Get rewarded with free night stays and member-only promotions.
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</section>

<script>
    function closeAlert() {
        var serverError = document.getElementById("serverError");
        serverError.style.display = "none"; // Hide the pop-up
    }
    function submit_form() {
        var submitData = validateFields();
        if (!submitData) return false;
    }

    function validateFields() {
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;
        var captcha = document.getElementById("captcha").value;

        var encodedStringUsername = btoa(username);
        var encodedStringPassword = btoa(password);
        var encodedStringCaptcha = btoa(captcha);

        document.getElementById("username").value = encodedStringUsername;
        document.getElementById("password").value = encodedStringPassword;
        document.getElementById("captcha").value = encodedStringCaptcha;

        return true;
    }
</script>
