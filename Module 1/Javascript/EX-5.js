// 5. Objects and Prototypes

function Event(name, date, seats) {

    this.name = name;
    this.date = date;
    this.seats = seats;
}

// Prototype Method
Event.prototype.checkAvailability = function () {

    if (this.seats > 0) {
        return "Seats Available";
    }

    return "House Full";
};

// Create Objects
const event1 = new Event(
    "Music Festival",
    "2026-08-15",
    25
);

const event2 = new Event(
    "Sports Meet",
    "2026-09-10",
    0
);

// Check Availability
console.log(
    event1.name,
    "-",
    event1.checkAvailability()
);

console.log(
    event2.name,
    "-",
    event2.checkAvailability()
);

// Display Keys and Values
console.log("Event 1 Details");

Object.entries(event1).forEach(
    ([key, value]) => {

        console.log(
            `${key}: ${value}`
        );
    }
);