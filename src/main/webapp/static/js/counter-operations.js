(function () {
    window.Operations = {};

    var self = Operations;

    self.increment = function () {
        $.ajax({
            url: URLs.counterUrl,
            type: 'POST',
            success: function (result) {
                if (result.success) {
                    incrementValue();
                }
            }
        });
    };

    self.decrement = function () {
        $.ajax({
            url: URLs.counterUrl,
            type: 'DELETE',
            success: function (result) {
                if (result.success) {
                    decrementValue();
                }
            }
        });
    };

    function incrementValue() {
        var value = Number($("#countValue").text());
        $("#countValue").text(++value);
    }

    function decrementValue() {
        var value = Number($("#countValue").text());
        $("#countValue").text(--value);
    }

})();
