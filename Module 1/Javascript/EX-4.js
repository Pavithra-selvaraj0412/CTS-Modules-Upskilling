// 4. Functions, Scope, Closures and Higher-Order Functions

let events = [];

// Add Event
function addEvent(name, category, seats) {

    events.push({
        name,
        category,
        seats
    });

    console.log(`${name} added successfully`);
}

// Register User
function registerUser(eventName) {

    const event = events.find(
        e => e.name === eventName
    );

    if (event && event.seats > 0) {

        event.seats--;

        console.log(
            `User registered for ${event.name}`
        );

    } else {

        console.log(
            "Registration failed"
        );
    }
}

// Filter Events
function filterEventsByCategory(category) {

    return events.filter(
        event => event.category === category
    );
}

// Closure Example
function registrationCounter() {

    let totalRegistrations = 0;

    return function () {

        totalRegistrations++;

        return totalRegistrations;
    };
}

const musicCounter = registrationCounter();

// Higher Order Function
function filterEvents(callback) {

    return events.filter(callback);
}

// Test Data
addEvent("Music Festival", "Entertainment", 30);
addEvent("Coding Workshop", "Education", 25);
addEvent("Sports Meet", "Sports", 15);

registerUser("Music Festival");

console.log(
    filterEventsByCategory("Education")
);

console.log(
    "Music Registrations:",
    musicCounter()
);

console.log(
    "Music Registrations:",
    musicCounter()
);

const filtered = filterEvents(
    event => event.seats > 20
);

console.log(filtered);