package org.example.app.dto.customer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * Java records - це по суті клас, мета якого зберігати дані та надавати
 * деякі спеціальні функції, наприклад, немає необхідності описувати
 * конструктор, геттер, equals, hashCode, оскільки в рекорді ці речі будуть
 * автоматично згенеровані компілятором
 */
// @JsonIgnoreProperties допомогає уникнути помилки
// при створенні об'єкту цього типу якщо якесь поле є null
@JsonIgnoreProperties(ignoreUnknown = true)
public record CustomerDtoRequest(Long id, String firstName,
                             String lastName, String address, String phone) {
}