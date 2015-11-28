var intervalID = window.setInterval(callBed2Rate, 1000);

function callBed2Rate()
{
    $.ajax
    ({
        url: 'Bed2Module',
        type: 'GET',
        dataType: 'text'
    }).done(function(data) 
    {
        var values = String(data);
        var splittedValues = values.split(",");
        document.getElementById('pulse2').innerHTML = splittedValues[0];
        document.getElementById('pulseBed2').innerHTML = splittedValues[0];
        document.getElementById('breathing2').innerHTML = splittedValues[1];
        document.getElementById('bloodSystolic2').innerHTML = splittedValues[2];
        document.getElementById('bloodDiastolic2').innerHTML = splittedValues[3];
        document.getElementById('temperature2').innerHTML = splittedValues[4];
        document.getElementById('temperatureBed2').innerHTML = splittedValues[4];
    });
}
