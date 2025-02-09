package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        // 🚀 Initialize the cosmic communication device (Scanner)
        Scanner in = new Scanner(System.in);

        // 🏗️ Construct our address blueprint containers
        StringBuilder billing = new StringBuilder();
        StringBuilder shipping = new StringBuilder();

        // 🌟 Illuminate the user journey with prompts
        System.out.println("🌐 Address Odyssey: Your Information Portal 🌐");
        System.out.println("Please provide the following information: ");

        // 👤 Capture the identity signature
        System.out.print("Full name: ");
        String full_name = in.nextLine();

        // 💼 Billing Address Excavation
        System.out.print("\n🏠 Billing Address Details:\n");
        System.out.print("Billing Street: ");
        String bill_street = in.nextLine();

        System.out.print("Billing City: ");
        String bill_city = in.nextLine();

        System.out.print("Billing State: ");
        String bill_state = in.nextLine();

        System.out.print("Billing Zip: ");
        int bill_zip = in.nextInt();

        // 🧹 Clear the input buffer
        in.nextLine();

        // 🚚 Shipping Address Expedition
        System.out.print("\n📦 Shipping Address Details:\n");
        System.out.print("Shipping Street: ");
        String ship_street = in.nextLine();

        System.out.print("Shipping City: ");
        String ship_city = in.nextLine();

        System.out.print("Shipping State: ");
        String ship_state = in.nextLine();

        System.out.print("Shipping Zip: ");
        int ship_zip = in.nextInt();

        // 🔧 Construct Billing Address Blueprint
        billing.append(bill_street)
                .append("\n")
                .append(bill_city)
                .append(", ")
                .append(bill_state)
                .append(" ");

        // 🚢 Construct Shipping Address Blueprint
        shipping.append(ship_street)
                .append("\n")
                .append(ship_city)
                .append(", ")
                .append(ship_state)
                .append(" ");

        // 📝 Transform Address Blueprints to Readable Format
        String myBills = billing.toString();
        String myShip = shipping.toString();

        // 🖨️ Unveil the Address Masterpiece
        System.out.println("\n🌈 Address Revelation 🌈");
        System.out.println(full_name);
        System.out.println("\n💳 Billing Address:");
        System.out.printf("%s %d\n", myBills, bill_zip);
        System.out.println("\n🚚 Shipping Address:");
        System.out.printf("%s %d\n", myShip, ship_zip);

        // 👋 Close the cosmic communication device
        in.close();
    }
}