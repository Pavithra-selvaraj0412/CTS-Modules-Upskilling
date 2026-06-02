// 3. Conditionals, Loops and Error Handling

const events = [
    {
        name: "Music Festival",
        date: "2026-08-15",
        seats: 20
    },
    {
        name: "Tech Workshop",
        date: "2025-01-01",
        seats: 15
    },
    {
        name: "Sports Meet",
        date: "2026-09-10",
        seats: 0
    }
];

const today = new Date();

console.log("Available Events");

events.forEach(event => {

    const eventDate = new Date(event.date);

    if (eventDate > today && event.seats > 0) {
        console.log(
            `${event.name} - Seats Available: ${event.seats}`
        );
    } else {
        console.log(
            `${event.name} - Hidden`
        );
    }
});

function register(event) {

    try {

        if (event.seats <= 0) {
            throw new Error("No seats available");
        }

        event.seats--;

        console.log(
            `Registered successfully for ${event.name}`
        );

        console.log(
            `Remaining Seats: ${event.seats}`
        );

    } catch (error) {

        console.log(
            `Error: ${error.message}`
        );
    }
}

register(events[0]);
register(events[2]);