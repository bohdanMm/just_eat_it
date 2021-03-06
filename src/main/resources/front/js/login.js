window.onload = function () {
    addNavigationMenu();
}


async function login() {
    let loginInfo = {
        email: document.querySelector('#email').value,
        password: document.querySelector('#password').value
    };

    try {
        await fetch(url + "main-user/login", {
            method: 'POST',
            body: JSON.stringify(loginInfo),
            headers: {
                'Content-Type': 'application/json'
            }
        })
            .then(response => response.json())
            .then((response) => {
                console.log(JSON.stringify(response))
                localStorage.setItem('user', JSON.stringify(response));
            })
            .then(() => window.location.href = "index.html");
    } catch (error) {
        console.error('Помилка:', error);
    }
}