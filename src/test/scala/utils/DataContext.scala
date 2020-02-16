package utils

import java.text.SimpleDateFormat
import java.util.Locale

import com.github.javafaker.Faker
import com.github.javafaker.service.{FakeValuesService, RandomService}

class DataContext(
                   val title: Int = new Faker().number().numberBetween(1, 2),
                   val emailValue: String = new FakeValuesService(new Locale("en-GB"), new RandomService()).bothify("????##@gmail.com"),
                   val passWord: String = new FakeValuesService(new Locale("en-GB"), new RandomService()).regexify("[a-z1-9]{10}"),
                   val dob: Array[String] = new SimpleDateFormat("d M yyyy").format(new Faker().date().birthday()).split("\\s"),
                   val firstN: String = new Faker().name().firstName(),
                   val lastN: String = new Faker().name().lastName(),
                   val company: String = new Faker().company().name(),
                   val enterAddressLine1: String = new Faker().address().buildingNumber(),
                   val enterAddressLine2: String = new Faker().address().streetName(),
                   val enterCity: String = new Faker().address().cityName(),
                   val enterState: Int = new Faker().number().numberBetween(1, 50),
                   val enterPostCode: String = new FakeValuesService(new Locale("en-GB"), new RandomService()).regexify("[1-9]{5}"),
                   val enterMobilePhone: String = new Faker().phoneNumber().cellPhone()
                 ){
}
