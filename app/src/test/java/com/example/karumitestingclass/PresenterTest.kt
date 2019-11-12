package com.example.karumitestingclass

import junit.framework.Assert.assertTrue
import org.junit.Test
import java.util.*

class PresenterTest {

    var view = MockView()
    private val presenter = Presenter(
        LogIn(), LogOut(FixedTimeClock(Date(2222222))), view
    )
    @Test
    fun `when click on log in button then hide log in form method and show log out form method are fired`() {
        presenter.onLogInButtonClick("galicia", "llueve")
        assertTrue(view.didInvokeHideLogInForm)
        assertTrue(view.didInvokeShowLogOutForm)
    }

    @Test
    fun `when click on log out button then hide log out form method and show log in form method are fired`() {
        presenter.onLogOutButtonClick()
        assertTrue(view.didInvokeHideLogOutForm)
        assertTrue(view.didInvokeShowLogInForm)
    }
}

class MockView: ViewTranslator{
    var didInvokeHideLogOutForm = false
    var didInvokeHideLogInForm = false
    var didInvokeShowLogInForm = false
    var didInvokeShowLogOutForm = false
    var didInvokeShowError = false

    override fun hideLogInForm() {
        didInvokeHideLogInForm = true
    }

    override fun hideLogOutForm() {
        didInvokeHideLogOutForm = true
    }

    override fun showLogInForm() {
        didInvokeShowLogInForm = true
    }

    override fun showLogOutForm() {
        didInvokeShowLogOutForm = true
    }

    override fun showError(message: String) {
        didInvokeShowError = true
    }
}