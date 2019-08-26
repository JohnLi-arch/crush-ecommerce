package com.john.crush.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.john.crush.user.Address;
import com.john.crush.user.ChargeRequest;

@Controller
@RequestMapping("/checkout")
public class CheckoutController {

    @Value("${STRIPE_PUBLIC_KEY}")
    private String stripePublicKey;

    @PostMapping("/delivery")
    private String showDeliveryPage(@ModelAttribute("chargeRequest") ChargeRequest chargeRequest, Model model) {
        model.addAttribute("chargeRequest", chargeRequest);
        model.addAttribute("address", new Address());
        return "checkout/address";
    }

    @PostMapping("/confirm")
    public String showConfirmPage(Model model) {
        model.addAttribute("amount", 500); // in cents
        model.addAttribute("stripePublicKey", stripePublicKey);
        model.addAttribute("currency", "USD");
        return "checkout/confirm";
    }

    @GetMapping("/payment")
    private String showPaymentPage() {
        return "checkout/payment";
    }
}
