
const themeToggle = document.getElementById("themeToggle");

// Load the saved theme, if available
const savedTheme = localStorage.getItem("portfolioTheme");

if (savedTheme === "dark") {
    document.body.classList.add("dark-mode");
}

updateButton();

// Toggle between dark and light themes
themeToggle.addEventListener("click", function () {
    document.body.classList.toggle("dark-mode");

    const isDarkMode =
        document.body.classList.contains("dark-mode");

    localStorage.setItem(
        "portfolioTheme",
        isDarkMode ? "dark" : "light"
    );

    updateButton();
});

// Update the button text
function updateButton() {
    const isDarkMode =
        document.body.classList.contains("dark-mode");

    themeToggle.textContent = isDarkMode
        ? "☀️ Light Mode"
        : "🌙 Dark Mode";
}
