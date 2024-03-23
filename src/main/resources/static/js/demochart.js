function getDailyLineChart(title) {
    const url = "/linechartdaily";
    fetch(url).then(res => res.json())
        .then((data) => {
            const xValues = [];
            const yValues = [];
            for (let i = 0; i < data.length; i++) {
                xValues.push(data[i].date);
                yValues.push(data[i].value);
            }
            drawLineChart('lineChartId', xValues, yValues, title);
        })
}

function getDailyBarChart(title) {
    const url = "/barchartdaily";
    fetch(url).then(res => res.json())
        .then((data) => {
            const xValues = [];
            const yValues = [];
            for (let i = 0; i < data.length; i++) {
                xValues.push(data[i].date);
                yValues.push(data[i].value);
            }
            drawBarChart('barChartId', xValues, yValues, title);
        })
}

function getDailyPieChart(title) {
    const url = "/piechartdaily";
    fetch(url).then(res => res.json())
        .then((data) => {
            const xValues = [];
            const yValues = [];
            const colors = [];
            for (let i = 0; i < data.length; i++) {
                xValues.push(data[i].x);
                yValues.push(data[i].y);
                colors.push('' + randomColors());
            }
            drawPieChart('pieChartId', xValues, yValues, colors, title);
        })
}

function drawLineChart(chartId, labels, data, title) {
    return new Chart(document.getElementById(chartId), {
            type: 'line',
            data: {
                labels: labels,
                datasets: [
                    {
                        data: data,
                        fill: false,
                        fontSize: 12,
                        borderColor: "#3e95cd",
                        pointBorderColor: "#065994",
                        pointBackgroundColor: "#065994",
                    }
                ]
            },
            options: {
                tooltips: {
                    titleFontSize: 10,
                    bodyFontSize: 10,
                },
                scales: {
                    xAxes: [{
                        ticks: {
                            fontSize: 10,
                        }
                    }],
                    yAxes: [{
                        ticks: {
                            beginAtZero: true,
                            min: 0,
                            precision: 0,
                            fontSize: 10,
                        }
                    }]
                },
                legend: {display: false},
                title: {
                    display: true,
                    fontSize: 14,
                    text: title
                }
            }
      });
}

function drawBarChart(chart, labels, data, title) {
    new Chart(document.getElementById(chart), {
        type: 'bar',
        data: {
            labels: labels,
            datasets: [
                {
                    data: data,
                    fill: false,
                    fontSize: 10,
                    backgroundColor: ["#0b84a5", "#f6c85f", "#6F4E7C", "#9dd866", "#ca472f", "#ffa056", "#8dddd0", "#9dd866"],
                }
            ]
        },
        options: {
            tooltips: {
                titleFontSize: 10,
                bodyFontSize: 10,
            },
            scales: {
                xAxes: [{
                    ticks: {
                        fontSize: 10,
                    }
                }],
                yAxes: [{
                    ticks: {
                        beginAtZero: true,
                        min: 0,
                        precision: 0,
                        fontSize: 10,
                    }
                }]
            },
            legend: {display: false},
            title: {
                display: true,
                fontSize: 14,
                text: title
            }
        }
    });
}

function drawPieChart(chartId, labels, data, colors, title) {
    new Chart(document.getElementById(chartId), {
        type: 'doughnut',
        data: {
            labels: labels,
            datasets: [{
                fontSize: 10,
                backgroundColor: colors,
                data: data
            }]
        },
        options: {
            tooltips: {
                titleFontSize: 10,
                bodyFontSize: 10,
            },
            title: {
                display: true,
                fontSize: 14,
                text: title
            },
            legend: {
                position: 'bottom',
                labels: {
                    fontSize: 10,
                    fontColor: "#A9A9A9"
                }
            }
        }
    });
}


function calculateMonthLables() {
    const month = new Date().getMonth() + 1;
    let labels = ["JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"];
    for (let i = 0; i < month; i++) {
        let m = labels.shift();
        labels.push(m);
    }
    return labels;
}

function randomColors() {
    const r = Math.floor(Math.random() * 255);
    const g = Math.floor(Math.random() * 255);
    const b = Math.floor(Math.random() * 255);
    return "rgb(" + r + "," + g + "," + b + ")";
}