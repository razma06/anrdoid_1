import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.signupapp.R

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.name_edittext)
        emailEditText = findViewById(R.id.email_edittext)
        passwordEditText = findViewById(R.id.password_edittext)
        registerButton = findViewById(R.id.register_button)

        registerButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (name.isEmpty()) {
                nameEditText.error = "Name is required"
                nameEditText.requestFocus()
                return@setOnClickListener
            }

            if (email.isEmpty()) {
                emailEditText.error = "Email is required"
                emailEditText.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                emailEditText.error = "Please enter a valid email address"
                emailEditText.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                passwordEditText.error = "Password is required"
                passwordEditText.requestFocus()
                return@setOnClickListener
            }

            if (password.length < 6) {
                passwordEditText.error = "Password should be at least 6 characters long"
                passwordEditText.requestFocus()
                return@setOnClickListener
            }

            // TODO: Save user data to a database or file

            Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show()
        }

    }
}
