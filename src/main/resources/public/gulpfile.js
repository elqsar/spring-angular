/**
 * Created by musatov on 23.4.2014.
 */
var gulp = require('gulp'),
    livereload = require('gulp-livereload');

gulp.task('default',['watch']);

gulp.task('watch', function(){
    var server = livereload();
    gulp.watch(['app/**/*.js', 'partials/*.html', 'index.html'], function(event) {
        server.changed(event.path);
        console.log('File '+event.path+' was '+event.type+', running tasks...');
    });
});